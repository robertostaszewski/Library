package library

class Loan {
	
	static belongsTo = [user: User, book: Book] 
	
	Date rentDate
	Date returnDate
	Date returned

    static constraints = {
		returned(nullable:true)
    }
}
