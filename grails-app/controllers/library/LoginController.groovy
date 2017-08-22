package library

class LoginController {

    def index() { }
	
	def login() {
		def user = session["user"]
		if(user==null){	
			if(User.findByLogin(params.username) == null){
				flash.message = "użytkownik nie istnieje"
				redirect(action:"index")
				return
			}
			user = User.findByLogin(params.username)
			if(user.password.equals(params.password)){
				session["user"] = user
			} else{
				flash.message = "złe hasło"
				redirect(action:"index")
				return
			}
		} 
		
		if(user.role.equals("admin")){
			redirect(controller: "AdminView", action: "index")
		} else{
			redirect(controller: "UserView", action: "index")
		}
	}
	
	def logout(){
		session["user"] = null
		redirect( action:"index")
	}
}
