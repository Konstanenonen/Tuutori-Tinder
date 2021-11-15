package application;

import java.util.ArrayList;
//tämä luokka listaa tuutorit
public class UsersList {
	//luo listan
	private ArrayList<Users> users;
	private int userIndex;
	
		public UsersList() {
			this.users = new ArrayList<>();
			this.userIndex = 0;
		}
		//lisää käyttäjä-oliot listaan
		public void addUser(Users user) {
			this.users.add(user);
		}
		//tuo listasta järjestyksessä käyttäjät
		public Users getUser() {
			//int max = this.users.size() - 1;
			//int min = 0;
			//return this.users.get((int) (Math.random() * (max - min + 1) + min));
			if (this.userIndex < (this.users.size() - 1) ) {
				this.userIndex++;
				return this.users.get(this.userIndex);
			} else {
				this.userIndex = 0;
				return this.users.get(this.userIndex);
			}
		}
	}
