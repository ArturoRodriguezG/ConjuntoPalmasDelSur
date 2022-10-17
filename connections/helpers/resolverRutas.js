

	export default (rutaNavega)=>{
	if (rutaNavega.length<3){
		return (rutaNavega==="/") ? rutaNavega : "/:id"
	}
	return `/${rutaNavega}`
}
