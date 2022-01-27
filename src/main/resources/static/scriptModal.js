
let open=document.getElementById("open");
let modal_container=document.getElementById("modal_container");
let close=document.getElementById("close");

window.onload=()=>{
    modal_container.classList.add("show");
};

/*modal_container.addEventListener('click',()=>{
    modal_container.classList.remove("show");
})*/

open.addEventListener('click',()=>{
    modal_container.classList.add("show");
});

close.addEventListener('click',()=>{
    modal_container.classList.remove("show");
});
