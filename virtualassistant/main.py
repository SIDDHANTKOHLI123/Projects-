import speech_recognition as speech
import pyttsx3
import pywhatkit
import datetime
import wikipedia
import pyjokes


listener=speech.Recognizer()
engine = pyttsx3.init()
voices=engine.getProperty('voices')
engine.setProperty('voice',voices[1].id)
systemopen=0

def talk(text):
    engine.say(text)
    print(text)
    engine.runAndWait()

def cleaned_command(command,keyword):
    return command.partition(keyword)[2]    


def take_command():
    try:
        with speech.Microphone() as source:
            if(systemopen==1):
                    talk('Welcome to your Companion Ecosystem')
                    talk('You can start with speaking Companion followed by your command')
            voice = listener.listen(source)
            command=listener.recognize_google(voice)
            command=command.lower()
            if 'companion' in command:
                command=command.cleaned_command(command,"companion")
                print(command)

    except:
        pass
    return command

def run_companion():
    command=take_command()
    if 'play' in command:
        song=cleaned_command(command,"play")
        try:
            talk('playing' + song)  
            pywhatkit.playonyt(song)
        except:
            pass    

    elif 'time' in command:
        now=datetime.datetime.now()
        current_time=now.strftime("%I :%M %p")
        try:
            talk(' Hi! Current time is'+ current_time)
        except:
            pass    

    elif 'tell me about' in command:
        person=cleaned_command(command,"about")
        info=wikipedia.summary(person,1)
        try:
            talk(info)
        except:
            pass 

    elif 'joke' in command:
        talk(pyjokes.get_joke()) 

    else :
        talk('Please say the command again')        



        
while True:
    systemopen+=1
    run_companion()          

