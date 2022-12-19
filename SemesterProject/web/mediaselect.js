
function mediaSelect(){        
    document.getElementById("film").style.display = 'none';
    document.getElementById("album").style.display = 'none';
    document.getElementById("videogame").style.display = 'none';
    document.getElementById("book").style.display = 'none';

    switch(document.getElementById("mediatype").value){
        case "film":
            document.getElementById("film").style.display = 'block';
            break;
        case "album":
            document.getElementById("album").style.display = 'block';
            break;
        case "videogame":
            document.getElementById("videogame").style.display = 'block';
            break;
        case "book":
            document.getElementById("book").style.display = 'block';
            break;
    }
}
