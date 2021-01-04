package Spectacle;

import java.time.LocalDate;

public class Rehearsal {
		private String titleRehearsal;
		private LocalDate dateRehearsal;
		
		public Rehearsal(String titleRehearsal,LocalDate dateRehearsal) {
			this.titleRehearsal = titleRehearsal.trim();
			this.dateRehearsal = dateRehearsal;
		}
		
		public String getTitle() {
			return titleRehearsal;
		}
		
		public LocalDate getDate() {
			return dateRehearsal;
		}
}
