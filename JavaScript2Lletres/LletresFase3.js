var nomi = ["I", "L", "A", "R", "I", "A"]
var Mapnom = new Map();
var n = 0;
for(var i=0; i<nomi.length; i++){
    var lett = nomi[i]
    for(var j=0; j<nomi.length; j++){
        if(nomi[j] == nomi[i]) n++
    }
    Mapnom.set(nomi[i], n);
    n=0;
 }
console.log(Mapnom)