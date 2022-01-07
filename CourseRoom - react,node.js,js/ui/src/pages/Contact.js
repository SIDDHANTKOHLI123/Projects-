import emailjs from 'emailjs-com';
import React from 'react';
import "../Styles/Contact.scss"


export default function ContactUs() {

    function sendEmail(e) {
        e.preventDefault();

        emailjs.sendForm('service_dy0hxw9', 'template_uetr76r', e.target, 'user_q64Cc6MLBmQl57HLS0aDf')
            // 'YOUR_TEMPLATE_ID'  form.current  e.target,  service_dy0hxw9
            .then((result) => {
                console.log(result.text);
            }, (error) => {
                console.log(error.text);
            });
        e.target.reset()
    }

    return (
        <div>
            <div className="container">

                <div class="contactus">
                    <h2>Contact Us</h2>
                

                <p><h4>We'd Love to hear from you, please drop us a line if you've any query.</h4></p>
                </div>
                <div class="contents">
                    <form onSubmit={sendEmail}>
                        <div className="row pt-5 mx-auto" >
                            <div className="col-8 form-group mx-auto">
                                <label className="name">Name :</label>
                                <input type="text" className="form-control" placeholder="Your Name " name="name" />
                            </div>
                            <div className="col-8 form-group pt-2 mx-auto" >
                                <label className="Phone Number">Phone Number :</label>
                                <input type="text" className="form-control" placeholder="Contact number" name="Contact" />
                                {/* <textarea className="phone" id="" cols="30" rows="B" placeholder="Your phone number" name="phone"></textarea> */}
                            </div >

                            < div className="col-8 form-group pt-2 mx-auto">
                                <label className="Email">Email Id :</label>
                                < input type="Email" className="form-control" placeholder="Email Address" name="email" />
                            </div>
                            <div className="col-8 form-group pt-2 mx-auto">
                                <label className="subject">Subject :</label>
                                <input type="text" className="form-control" placeholder="Subject" name="Subject" />
                            </div >
                            <div className="col-8 form-group pt-2 mx-auto" >
                                <label className="message">Please provide Information : </label>
                                <textarea className="form-control" id="" cols="30" rows="B" placeholder="Your message" name="message"></textarea>
                            </div >
                      
                            <div className="col-8 pt-2 mx-auto" >
                                <button type="submit" className="btn btn-info" value="Send Message">Submit</button>
                            </div >

                        </div>
                    </form>
                </div>
            </div>
        </div>
    )
}