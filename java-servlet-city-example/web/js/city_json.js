$(function () {
    $("#province").change(function () {
        var pid = $(this).val();
        console.log("change" + pid);
        $.post("city", {pid: pid}, function (data, state) {
            $("#city").html("<option value=''>--请选择--</option>");
            $(data).each(function (idx, city) {
                $("#city").append("<option value='" + city.id + "'>" + city.name + "</option>");
            });
        });
    }) ;
});