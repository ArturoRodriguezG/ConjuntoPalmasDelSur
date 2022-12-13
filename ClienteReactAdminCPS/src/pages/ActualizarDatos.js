import axios from 'axios';
import { useState } from 'react';
import {Row, Col, Container, Alert} from 'react-bootstrap';
import { Link, useNavigate, useParams } from 'react-router-dom';
import { ActualizaDatosFormulario } from '../components/ActualizaDatosFormulario';
import {DATOS_PUT_ENDPOINT} from "../connections/endpoints"

const ActualizarDatos= ()=>{
    const navegar= useNavigate()
    const [errores, setErrores]= useState([])
  //  const {codigo}= useParams()

    const datos= async ({codigo, nombre, correo, telefono1, telefono2})=>{
        const error={}
        setErrores(error)

        console.log("grabanditoooo")
        axios.put(`${DATOS_PUT_ENDPOINT}/${codigo}`, 
            {codigo, nombre, correo, telefono1, telefono2}
        )
    .then(
        respuesta=>{
            navegar("/bienvenida")
        }
    )
    .catch(error=>{
            console.log(error.message)
        })
    }
    return(
    <Container className= "mt-3 mb-3">
        <Row className= "justify-content-md-center">
            <Col ms="12" md="8" lg="6">
                <h3>ACTUALIZACIÓN DE DATOS</h3>
                <div> 
                    {errores.crear && <Alert variant="danger">{errores.crear}</Alert>}
                    <ActualizaDatosFormulario callback={datos} />
                    <Link to={"/bienvenida"}></Link>
                </div>
            </Col>
        </Row>
    </Container>
  )
}

export {ActualizarDatos}
