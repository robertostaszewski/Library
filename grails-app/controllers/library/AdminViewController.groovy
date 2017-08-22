package library

class AdminViewController {

    def index() {
		def loggedUser = session["user"]
		if(loggedUser == null){
			redirect(controller:"login", action:"index")
			return
		}
		else if(loggedUser.role.equals("admin")){
			render(view:'admin',
				model:[loans:Loan.getAll(),
						users:User.getAll()])
		}
	}
	
	def logout(){
		redirect(controller:"login", action:"logout")
	}
}
