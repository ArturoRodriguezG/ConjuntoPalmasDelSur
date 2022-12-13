import axios from "axios"
import { useEffect, useState } from 'react';
import { Button, Form } from "react-bootstrap";
import {CONSUL_GET_ENDPOINT} from "../connections/endpoints"

const ActualizaDatosFormulario= ({callback})=>{
    
    const [dresidente, setDresidente]= useState([])
    const [codigo, setCodigo]= useState("")
    const [nombre, setNombre]= useState("")
    const [correo, setCorreo]= useState("")
    const [telefono1, setTelefono1]= useState("")
    const [telefono2, setTelefono2]= useState("")

    useEffect(()=>{
            axios.get(CONSUL_GET_ENDPOINT)
            .then(respuesta=>{
                setDresidente(respuesta.data)
            })
            .catch(err=>{
                console.error(err)
            })
    },{})

    const enviaDatos= (e)=>{
        e.preventDefault()
        callback({codigo, nombre, correo, telefono1, telefono2})
    }

    return(
        <Form onSubmit= {enviaDatos} >
            <Form.Group className="col-lg-4">
                <Form.Label classname="mt-10">Código: </Form.Label>
                <Form.Control type= "text" 
                    placeholder= {dresidente.codigo} disabled 
                    defaultValue={dresidente.codigo}
                    Value= {dresidente.codigo}
                    onChange={e=> setCodigo(e.target.value)}/>
            </Form.Group>

            <Form.Group className="mb-3">
                <Form.Label>Nombre: </Form.Label>
                <Form.Control 
                    type="text" 
                    placeholder={dresidente.nombre}
                    defaultValue={dresidente.nombre} 
                    Value={dresidente.nombre} 
                    onChange={e=> setNombre(e.target.value)} />
            </Form.Group>

                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-6">
                    <Form.Label>Email: </Form.Label>
                    <Form.Control type="text" placeholder={dresidente.correo} 
                        defaultValue={dresidente.correo}
                        Value= {dresidente.setCorreo}
                        onChange={e=> setCorreo(e.target.value)}/>
                     
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-6">
                    <Form.Label>Telefono 1: </Form.Label>
                    <Form.Control type="text" placeholder={dresidente.telefono1} 
                            defaultValue={dresidente.telefono1}
                            Value= {dresidente.telefono1}
                            onChange={e=> setTelefono1(e.target.value)}/>
                     
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-6">
                    <Form.Label>Telefono 2: </Form.Label>
                    <Form.Control type="text" placeholder={dresidente.telefono1} 
                            defaultValue={dresidente.telefono2}
                            Value= {dresidente.telefono2}
                            onChange={e=> setTelefono2(e.target.value)} />
                     
                </Form.Group>
                <br></br>
            <div className="mb-2">
                <Button variant="primary" type="submit" size="lg" className="mt-10" >
                    Actualizar y salir
                </Button>    
            </div>
        </Form>
    )
}

export {ActualizaDatosFormulario}
