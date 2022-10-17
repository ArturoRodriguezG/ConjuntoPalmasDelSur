
//import {Header} from "../layouts/Header.js"
import {Nav} from "../layouts/Nav.js"
import {Footer} from "../layouts/Footer.js"
import {Error404} from "../pages/Error404.js"
import {Bienvenida} from "../pages/Bienvenida.js"
import {InicioSesion} from "../pages/InicioSesion.js"
import {ConsultaDatos} from "../pages/ConsultaDatos.js"
import {ActualizarDatos} from "../pages/ActualizarDatos.js" 
import {ActualizarTarifas} from "../pages/ActualizarTarifas.js"
import {GenerarFactura} from "../pages/GenerarFactura.js"
import {RegistrarPago} from "../pages/RegistrarPago.js"
import {GenerarExtracto} from "../pages/GenerarExtracto.js"
import {ReporteCartera} from "../pages/ReporteCartera.js"
import {resolverRutas} from "../connections/helpers/resolverRutas.js"
import {getHash} from "../connections/helpers/getHash.js"

  const Rutas= {
                "/": Bienvenida, 
                "/inicioSesion": InicioSesion,
				"/consultaDatos": ConsultaDatos,
				"/actualizarDatos": ActualizarDatos,
				"/actualizarTarifas": ActualizarTarifas,
				"/generarFactura": GenerarFactura,
				"/registrarPago": RegistrarPago,
				"/generarExtracto": GenerarExtracto,
				"/reporteCartera": ReporteCartera
            }

    const App= async ()=>{
		const header= document.querySelector("header")
		const main= document.querySelector("main")
		const footer= document.querySelector("footer")
		header.innerHTML= await Nav()
		footer.innerHTML= await Footer()
//	header.innerHTML= Header()

		let ruta= await resolverRutas(getHash())
		const pagina= (Rutas[ruta]) ? Rutas[ruta] : Error404 
 	    main.innerHTML=pagina()
    }
export {App}
