let btnPrev=document.getElementById("button-prev");
let btnNext=document.getElementById("button-next");
let track=document.getElementById("track");
let slickList=document.getElementById("slick-list");
let slick=document.querySelectorAll(".slick");

let slickWidth=slick[0].offsetWidth;

btnPrev.onclick=()=>Move(1);
btnNext.onclick=()=>Move(2);

function Move(value){
    const trackWidth=track.offsetWidth;
    const listWidth=slickList.offsetWidth;

    track.style.left==""?leftPosition=track.style.left=0:leftPosition=parseFloat(track.style.left.slice(0,-2)*-1);

    if(leftPosition < (trackWidth - listWidth) && value==2){
        track.style.left=`${-1*(leftPosition+slickWidth)}px`;
    }else if(leftPosition>0 && value==1){
        track.style.left=`${-1*(leftPosition-slickWidth)}px`;
    }

}













