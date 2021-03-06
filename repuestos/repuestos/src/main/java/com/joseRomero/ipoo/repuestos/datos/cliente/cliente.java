package com.joseRomero.ipoo.repuestos.datos.cliente;

//Inicio de la clase
//nomeclatura: visibilidad class nombre de clase
public class cliente {

		//atributos
		private int id;
		private String nroDoc;
		private String tipoDoc;
		private String nombre;
		private String direccion;
		private String telefono;
		private String password;
		
		//constructor 1
		public cliente(){
		
		}
		
		//constructor 2
		public cliente(int id, String nroDoc, String tipoDoc, String nombre, String direccion, String telefono,
				String password) {
			super();
			this.id = id;
			this.nroDoc = nroDoc;
			this.tipoDoc = tipoDoc;
			this.nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
			this.password = password;
		}

		//metodos
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNroDoc() {
			return nroDoc;
		}

		public void setNroDoc(String nroDoc) {
			this.nroDoc = nroDoc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		//fin metodos
	
}
// fin de la clase