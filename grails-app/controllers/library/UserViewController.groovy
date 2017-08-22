package library

class UserViewController {

    def index() {
		def loggedUser = session["user"]
		if(loggedUser == null){
			redirect(controller:"login", action:"index")
			return
		}
		else if(loggedUser.role.equals("user")){
			render(view:'user',
				model:[
					availableBooks:Loan.executeQuery('select b from Book b where available=true'),
					rentBooks:Loan.executeQuery('select b from Book b where available=false'), 
					myBooks: Loan.executeQuery("select l from Loan l where l.user.id="+loggedUser.id + "and returned=null"),
					myReturnedBooks: Loan.executeQuery("select l from Loan l where l.user.id="+loggedUser.id + "and returned<>null")
					]
			)
		}
	}
	
	def logout(){
		redirect(controller:"login", action:"logout")
	}
	
	def rent(){
		Calendar cal = Calendar.getInstance()
		cal.add(Calendar.MONTH, 3)
		def loan = new Loan(rentDate: new Date(), returnDate: cal.getTime())
		User.get(session["user"].id).addToLoans(loan).save()
		def book = Book.get(Long.parseLong(params.bookid))
		book.available = false
		book.addToLoans(loan).save(flush:true)
		loan.save(flush:true)
		redirect(action:"index")
	}
	
	def returnBook(){
		def loan = Loan.get(Long.parseLong(params.loanid))
		loan.returned = new Date()
		loan.book.available = true
		loan.save(flush:true)
		redirect(action:"index")
	}
}
