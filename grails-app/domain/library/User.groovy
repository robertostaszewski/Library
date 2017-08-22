package library

class User {
	
	String name
	String login
	String password
	String role
	
	static hasMany = [loans: Loan]

    static constraints = {
		login unique: true
    }
}
