from cv2 import cv2
import cvzone

cap = cv2.VideoCapture(0)
filter=cv2.imread('filters/sunglass.png',cv2.IMREAD_UNCHANGED)
cascade=cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

while True:
    _,frame=cap.read();
    gray_scale = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces = cascade.detectMultiScale(gray_scale)
    for (x, y, w, h) in faces:
        cv2.rectangle(frame,(x, y), (x+w, y+h), (0, 255, 0), 2)
        # overlay_resize = cv2.resize(filter, (int(w*1.5), int(h*1.5)))
        # frame = cvzone.overlayPNG(frame, overlay_resize, [x-45, y-75])
        overlay_resize=cv2.resize(filter,(w,h))
        frame=cvzone.overlayPNG(frame,overlay_resize,[x,y])
    cv2.imshow('Snap chat',frame)
    if cv2.waitKey(10) == ord('q'):
        break