import { CONSUL_POST_ENDPOINT } from "./endpoints.js"

const API= CONSUL_POST_ENDPOINT

export default async (id)=>{

    const  apiUrl= (id) ? `${API}${id}` : API

    try {
        const response= await fetch(apiUrl)
        const data = await response.json()
        return data
    } catch (error) {
        console.log("error fetch", error)
    }
}