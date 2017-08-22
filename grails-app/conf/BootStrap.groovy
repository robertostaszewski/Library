import library.Author
import library.Book
import library.Loan
import library.User

class BootStrap {

    def init = { servletContext ->
		
		def amdmin = new User(password: "admin",
			login: "admin",
			role: "admin",
			name: "Jacus").save()
			
		def marcin = new User(password: "krzysztof123",
			login: "krzysztof",
			role: "user",
			name: "Krzysztof Gojdź").save()
				
		def damian = new User(password: "damian123",
			login: "damian",
			role: "user",
			name: "Damian Kordas").save()
					
		def grzegorz = new User(password: "grzegorz123",
			login: "grzegorz",
			role: "user",
			name: "Grzegorz Krychowiak").save()
						
		def wojtek = new User(password: "wojtek123",
			login: "wojtek",
			role: "user",
			name: "Wojtek Mazolewski").save()
							
		def igor = new User(password: "igor123",
			login: "igor",
			role: "user",
			name: "Igor Chmielnik").save()
		
		def book1 = new Book(title: "Good night, Dżerzi", available: true)
		
		def book2 = new Book(title: "Sonia, która za dużo chciała", available: true)
		
		def book3 = new Book(title: "Przeszłość", available: true)
		
		def book4 = new Book(title: "Bliżej siebie", available: true)
		
		def book5 = new Book(title: "Toy Wars", available: true)
		
		def book6 = new Book(title: "Zapach szkła", available: true)
		
		def book7 = new Book(title: "Pomnik Cesarzowej Achai", available: true)
		
		def autor1 = new Author(name: "Janusz Głowacki")
						.addToBooks(book1)
						.addToBooks(book2).save()
						
		def autor2 = new Author(name: "Tessa Hadley")
						.addToBooks(book3)
						.addToBooks(book4).save()
						
		def autor3 = new Author(name: "Andrzej Ziemiański")
						.addToBooks(book5)
						.addToBooks(book6)
						.addToBooks(book7).save()
						
		
		
    }
    def destroy = {
    }
}
