import '../css/App.css';
import "bootstrap/dist/css/bootstrap.min.css"
import { Navegacion } from '../layout/Navegacion';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Bienvenida } from "../pages/Bienvenida"
// import { Footer } from "../pages/Footer"
import { ConsultaDatos }  from "../pages/ConsultaDatos"

function App() {
  return ( 
    <BrowserRouter>
      <Navegacion />
      <Routes>
        <Route path='/bienvenida' element={<Bienvenida />} />
        <Route path='/consultaDatos' element={<ConsultaDatos />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App;