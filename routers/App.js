import {Nav} from "../layout/Nav.js"
import {Footer} from "../layout/Footer.js"

//se autocompleta lo contenido en rutas//
import {Registrarse} from "../pages/Registrarse.js"
//importar Error404

import {Error404} from "../pages/Error404.js"
import resolverRutas from "../connections/ResolverRutas.js"
import getHash from "../connections/helpers/getHash.js"

    const Rutas= {
                "/": PartidosCreados, 
                "/registrarse": Registrarse, 
                etc demás rutas
            }

    const App= async ()=>{
	    const header= document.querySelector("header")
	    const main= document.querySelector("main")
	    const footer= document.querySelector"footer")
	    header.innerHTML= await Nav()
	    footer.innerHTML= await Footer()

	// operador ternario
	    let ruta= await ResolverRuta(gerHash)
	    const pagina= (Rutas[ruta]) ? Rutas[ruta] : Error404 
 
	    main.innerHTML= await paginas()
    }
export {App}
