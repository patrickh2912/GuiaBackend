$(document).ready(function () {
    $('#boton_menu').on("click",function() {

        if ($("#boton_menu").attr("class") === "fa fa-bars") {
            $("#boton_menu").removeClass("fa fa-bars").addClass("fa fa-close");
            $(".navegacion .menu").css({"left": "0px"});

        } else {
            $("#boton_menu").removeClass("fa fa- close").addClass("fa fa-bars");
            $(".navegacion .menu").css({"left": "-350px"});
        }
    });
});
