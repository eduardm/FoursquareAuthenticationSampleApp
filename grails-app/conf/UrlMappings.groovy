class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller: "home", action:"index")
        "/callback"(controller: "home", action: "callback")
		"500"(view:'/error')
	}
}
