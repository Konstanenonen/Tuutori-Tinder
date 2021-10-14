package application;

public class TuutoriProfile {
	
	private boolean isTuutori;
	private boolean contact;
	private String skillz;
	
	public TuutoriProfile(String skillz) {
		this.isTuutori = true;
		this.contact = false;
		this.skillz = skillz;
	}
	
	public void setTuutori(boolean setTuutori ) {
		this.isTuutori = setTuutori;
	}
	
	public boolean getTuutori() {
		return this.isTuutori;
	}
	
	public void setSkillz(String skillz) {
		this.skillz = skillz;
	}
	
	public String getSkillz() {
		return this.skillz;
	}
	
	public void acceptContact(boolean wantToContact) {
		
		this.contact = wantToContact;
		
		if (this.contact = true) {
			return this.getEmail(); //Tämä tulee Account luokasta
		}
		
		this.contact = false;
		
	}
	
	@Override
	public String toString() {
		return "My skills are" + getSkillz();
	}

}
