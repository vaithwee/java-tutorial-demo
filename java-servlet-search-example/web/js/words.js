function getWords() {
    var keyword = $("#keyword").val();
    if (keyword == "") {
        $("#words").hide();
    } else  {
        $.post("words", {keyword: keyword}, function (data, state) {
            if (data != "") {
                $("#words").show();
                $("#words").html(data);
            } else  {
                $("#words").hide();
            }
        });
    }

}