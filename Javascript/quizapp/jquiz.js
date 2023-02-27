const quiz=[
    {
        question:'Suppose you have an undirected graph G with n vertices and m edges represented using an adjacency list. What is the worst-case time complexity of determining if there exists an edge between two given vertices u and v in G?',
        a:' O(n) ',
        b: 'O(m) ',
        c: ' O(log n) ',
        d: 'O(min(deg(u), deg(v)))',
        answer: "d"
    },
    {
        question:'Suppose you have a weighted undirected graph G with n vertices and m edges. What is the time complexity of computing the shortest path between two vertices using Dijkstras algorithm with a binary heap data structure?',
        a:'  O(n^2)  ',
        b: 'O(m log m) ',
        c: ' O(m log n)  ',
        d: 'O(n log n)',
        answer: "c"
    },
    {
        question:'Which of the following functions is a faster growing function than O(n^2)?',
        a:'  O(n^3)  ',
        b: 'O(n^(3/2)',
        c: ' O(2^n)  ',
        d: 'O(n)*2 + O(1)',
        answer: "c"
    }

]

const questEl=document.getElementById("question");
const a_text=document.getElementById("a_text");
const b_text=document.getElementById("b_text");
const c_text=document.getElementById("c_text");
const d_text=document.getElementById("d_text");
const sbmtbtn=document.getElementById("sbmtbtn");

let intialques=0;

function callQuestion(){
        const currentQuizData=quiz[intialques];
        questEl.innerHTML=currentQuizData.question;
        a_text.innerHTML=currentQuizData.a;
        b_text.innerHTML=currentQuizData.b;
        c_text.innerHTML=currentQuizData.c;
        d_text.innerHTML=currentQuizData.d;

    
}
let score=0;
callQuestion()

sbmtbtn.addEventListener('click',()=>{

    const t=atLeastOneRadio();
    const correct=quiz[intialques].answer;
    if (t) {
            if(t===correct){
                score++;
                alert("Correct answer")
            }
            else{
               
                alert("Incorrect answer . Correct answer is " + correct + ") " + quiz[intialques][correct])
            }
    intialques++;
    if(intialques==quiz.length){
        alert("Thank you for completing the quiz your score is " + score + " out of " + quiz.length );
        location.reload();
    }
    else{
    callQuestion();
    }
    }
    else{
        alert("Plase select an option to go ahead")
    }
});

function atLeastOneRadio(){
    const radioButtons = document.querySelectorAll(".answer");
    //const radioButtons = document.querySelectorAll('input[name="answer"]');
    for (const radioButton of radioButtons) {
        if (radioButton.checked){
            return radioButton.id;
         }
    }
     
     return false;

}

function checkAnswerCorrect(){

}