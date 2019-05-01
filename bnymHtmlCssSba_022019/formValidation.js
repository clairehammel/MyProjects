$(function(){
    $("#username_error_message").hide();
    $("#password_error_message").hide();
    $("#retype_password_message").hide();
    $("#email_error_message").hide();

    var error_username = false;
    var error_password = false;
    var error_retype_password = false;
    var error_email = false;

    $("#form_username").focusout(function(){
    check_usename();
});   
    $("#form_password").focusout(function(){
    check_usename();
 });   
    $("#form_retype_password").focusout(function(){
    check_usename();
}); 
    $("#form_email").focusout(function(){
    check_usename();
});
function check_username(){
    
}
});