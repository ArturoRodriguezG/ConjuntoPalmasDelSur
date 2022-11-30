import React, { useState} from "react";
import Carousel from 'react-bootstrap/Carousel';
import imagen1 from "../img/conjunto/Imagen1.jpg";
import imagen2 from "../img/conjunto/Imagen2.jpg";
import imagen3 from "../img/conjunto/imagen3.jpeg";
import imagen4 from "../img/conjunto/imagen4.jpg";
import imagen5 from "../img/conjunto/imagen5.jpg";
import imagen6 from "../img/conjunto/imagen6.jpeg";
import imagen7 from "../img/conjunto/imagen7.jpg";

const Bienvenida= ()=> {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex, e) => {
    setIndex(selectedIndex);
  }
  return (
    <Carousel activeIndex={index} onSelect={handleSelect}>

      <Carousel.Item>
          <h1>Comodidad de acceso</h1>
          <img className="d-block w-100"
            height="500"
            width="400"
            src= {imagen1}
            alt="" />
      </Carousel.Item>

      <Carousel.Item>
          <h1>Senderos verdes peatonales</h1>
          <img className="d-block w-100"
            height= "500"
            width="400"
            src= {imagen2}
            alt="" />
      </Carousel.Item>

      <Carousel.Item>
          <h1>Amplias zonas verdes</h1>
          <img className="d-block w-100"
          height= "500"
          width="400"
          src={imagen3}
          alt="" />
      </Carousel.Item>

      <Carousel.Item>
        <h1> Confortable sala de espera</h1>
        <img className="d-block w-100"
        height= "500"
        width="400"
          src={imagen4}
          alt="" />
      </Carousel.Item>

      <Carousel.Item>
        <h1>Parque infantíl</h1>
        <img className="d-block w-100"
        height= "500"
        width="400"
          src={imagen5}
          alt="" />
      </Carousel.Item>

      <Carousel.Item>
        <h1>Acceso a Polideportivo</h1>
        <img className="d-block w-100"
        height= "500"
        width="400"
          src={imagen6}
          alt=""  />
      </Carousel.Item>

      <Carousel.Item>
        <h1>Espectaculares piscinas</h1>
        <img className="d-block w-100"
        height= "500"
        width="400"
          src={imagen7}
          alt="" /> 
      </Carousel.Item>

    </Carousel>
  )
}
export {Bienvenida }