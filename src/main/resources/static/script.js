
let cambio=document.getElementById("cambio");
let formulario=document.getElementById("formulario");
let registro=document.getElementById("registro");
let volver=document.getElementById("volver");
let fomrRegistro=document.forms['formRegistro'];
let btnReg=document.getElementById("btnReg");
let error=document.getElementById("error");
let imgLogin=document.getElementById("imgLogin");
let body=document.getElementById("body");
var i=0;
let imagenes=["img/book.png","img/book2.png","img/book3.png"];

function cambioImagen(){
    imgLogin.src=imagenes[i];
    if(i<imagenes.length-1){
        i++;
    }else{
        i=0;
    }   
}

window.onload=setInterval(() => {
    cambioImagen();
}, 1500);


cambio.addEventListener('click',()=>{
    formulario.classList.remove("ocultar");
    formulario.classList.remove("mostrar");
    formulario.classList.add("ocultar");
    registro.classList.remove("ocultar");
});

volver.addEventListener('click',()=>{
    registro.classList.remove("ocultar");

    registro.classList.add("ocultar");
    formulario.classList.add("mostrar");
})

btnReg.addEventListener('click',()=>{
    //console.log(fomrRegistro[0].value);
    validar(fomrRegistro)
});


function validar(form){
    if(form[0].value==""){
        error.innerHTML="Rellene el campo";
    }
    else{
        error.innerHTML="";
    }
    
}
