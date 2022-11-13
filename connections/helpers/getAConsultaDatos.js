
const API= "http://localhost:8080/getAConsultaDatos"

export default async (id)=>{

    const  apiUrl= (id) ? `${API}${id}` : API

    try {
        const response= await fretch(apiUrl)
        const data = await response.json()
        return data
    } catch (error) {
        console.log("error fretch", error)
    }
}