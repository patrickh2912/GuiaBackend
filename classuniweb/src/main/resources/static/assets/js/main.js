function entrada (){

    var titulo2=document.getElementById('volver');
    titulo2.style.color="yellow";

    function parpadeo() {
        if( titulo2.style.color==="yellow"){
            titulo2.style.color="whitesmoke";
        }
        else{
            titulo2.style.color="yellow";
        }

    }
    var timer = setInterval(parpadeo,500);

}
window.onload=entrada();