var t_nom=["I", "l", "a", "r", "i", "a", "7"]
	for (var i=0; i<t_nom.length; i++){
		if ((t_nom[i] == "a") || (t_nom[i] == "e") || (t_nom[i] == "i")|| (t_nom[i] == "o") || (t_nom[i] == "u")) {
			console.log(t_nom[i] + " - VOCAL -");
			} else if (t_nom[i] == "0" || t_nom[i] == "1" || t_nom[i] == "2" || t_nom[i] == "3" || t_nom[i] == "4" || t_nom[i] == "5" || t_nom[i] == "6" || t_nom[i] == "7" || t_nom[i] == "8" || t_nom[i] == "9") {
					console.log(t_nom[i] + " !!!Els noms de les persones no contenen numeros!!!");
				}else { 
						console.log(t_nom[i] + " - CONSONANT -"); }
		 		}