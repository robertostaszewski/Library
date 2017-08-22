package library

class Book {
	
	String title
	Boolean available
	
	static belongsTo = [author: Author]
	static hasMany = [loans: Loan]

    static constraints = {
		title unique: true
		available defaultValue: true
    }
}
