$(function(){
    hentAlleBilletter();
});

function hentAlleBilletter() {
    $.get( "/hentBilletter", function( billetter ) {
        formaterBilletter(billetter);
    });
}

function formaterBilletter(billetter){
    let ut = "<table class='table table-striped'>" +
        "<tr>" + "<th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefon</th><th>E-post</th><th>Film</th>" +
        "</tr>";
    for(const billett of billetter){
        ut+="<tr>" +
            "<td>"+billett.antall+"</td>"+
            "<td>"+billett.fornavn+"</td>"+
            "<td>"+billett.etternavn+"</td>"+
            "<td>"+billett.telefon+"</td>"+
            "<td>"+billett.epost+"</td>"+
            "<td>"+billett.valgtFilm+"</td>"+
            "</tr>";
    }
    $("#billettene").html(ut);
}

function slettBilletter() {
    $.get("/slettAlleBilletter", function (){
        window.location.href = '/';
    });
}