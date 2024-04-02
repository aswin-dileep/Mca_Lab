let op 
let result 
let pre
function btn(e){
    document.getElementById("screen").value = e
}

function exp(a){
     pre = document.getElementById("screen").value;
    let screen =document.getElementById("screen");
    screen.value=""
    op=a
}

function eql(){
    result = eval(pre+op+document.getElementById("screen").value);
    document.getElementById("screen").value=result
}
