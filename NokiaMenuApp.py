        def display_menu(self):
        print(self.menu_content[self.current_page])

    def navigate_to_page(self, page_number):
        if page_number in self.menu_content:
            self.current_page = page_number
        else:
            print("Page not found.")

    def navigate_menu(self):
        while True:
            self.display_menu()

            choice = input("Enter your choice (or 'exit' to quit): ")

            if choice.lower() == 'exit':
                break

            try:
                choice = int(choice)
                if choice == 0: 
                    if self.current_page > 4:
                        self.current_page -= 1
                elif choice <= len(self.menu_content[self.current_page].split('\n')) - 1:
                    self.navigate_to_page(choice + 3) 
                else:
                    print("Invalid choice. Please try again.")
            except ValueError:
                print("Invalid input. Please enter a number.")


