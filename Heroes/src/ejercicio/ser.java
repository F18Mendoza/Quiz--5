package ejercicio;

class ser implements heroes {

    public String ser;
    public String power;

    @Override
    public void especie(String e) {
        this.ser =e; 
        
    }

    @Override
    public void poder(String p) {
        this.power = p ; 
        
    }

    public String getEspecie() {
		return ser;
	}

    public String getPoder() {
		return power;
	}

}
    
