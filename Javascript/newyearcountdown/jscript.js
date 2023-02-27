

var oneYearFromNow = new Date();
oneYearFromNow.setFullYear(oneYearFromNow.getFullYear() + 1);
const nextnew = "1 Jan "+oneYearFromNow.getFullYear()

document.getElementById('mainhead').innerHTML="The timer to next new year " + oneYearFromNow.getFullYear()


function timeDiff(){
const newYearDate=new Date(nextnew);
const todayDate=new Date();
let delta= Math.abs(newYearDate - todayDate)/1000;

let days = Math.floor(delta / 86400);
delta -= days * 86400;

let hours = Math.floor(delta / 3600) % 24;
delta -= hours * 3600;


let minutes = Math.floor(delta / 60) % 60;
delta -= minutes * 60;

let seconds = Math.floor(delta % 60); 

document.getElementById("days").innerHTML=days

document.getElementById("hours").innerHTML=hours
document.getElementById("mins").innerHTML=minutes
document.getElementById("secs").innerHTML=seconds


}


setInterval(timeDiff,1000);