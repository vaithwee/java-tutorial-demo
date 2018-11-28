$(function () {
   $("#province").change(function () {
       var pid = $(this).val();
       console.log("change" + pid);
       $.post("city", {pid: pid}, function (data, state) {
           $("#city").html("<option value=''>--请选11择--</option>");
           $(data).find("city").each(function () {
                var id = $(this).children("id").text();
                var name = $(this).children("name").text();
                $("#city").append("<option value='" + id + "'>" + name + "</option>");
           });
       });
   }) ;
});