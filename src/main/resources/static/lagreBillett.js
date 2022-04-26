$(function (){
    hentFilmer();
});

function hentFilmer(){
    $.get("/hentFilmer", function(filmer) {
        formaterFilmer(filmer);
    });
}

function formaterFilmer(filmer){
    let ut = "<select id='valgtFilm'>";
    for(const film of filmer){
        ut+="<option value='"+film.tittel+"'>"+film.director+"</option>";
    }
    ut+="</select>";
    $("#filmene").html(ut);
}

function lagreBillett(){
    const billett = {
        antall : $("#antall").val(),
        fornavn : $("#fornavn").val(),
        etternavn : $("#etternavn").val(),
        telefon : $("#telefon").val(),
        epost : $("#epost").val(),
        valgtFilm : $("#valgtFilm").val()
    };
    const url = "/lagreBillett";
    $.post(url,billett,function(){
        window.location.href = '/';
    });
}