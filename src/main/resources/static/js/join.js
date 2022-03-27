$(function() {
    $('#form').submit(function() {
        let inputPassword = $('#inputPassword').val();
        let passwordck = $('#passwordck').val();

       if(inputPassword!=passwordck) {
            $("#pwck_error").css("display", "block");
            $('#passwordck').focus();
            return false;
        } else $("#pwck_error").css("display", "none");
       
    });
});