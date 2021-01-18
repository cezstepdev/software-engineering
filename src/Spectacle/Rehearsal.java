package Spectacle;


public class Rehearsal {
		private Integer idRehearsal;
		private String titleRehearsal;
		private String dateRehearsal;
		
		public Rehearsal(String titleRehearsal,String dateRehearsal) {
			this.titleRehearsal = titleRehearsal.trim();
			this.dateRehearsal = dateRehearsal;
		}
		
		public String getTitle() {
			return titleRehearsal;
		}
		
		public String getDate() {
			return dateRehearsal;
		}
		
		public Rehearsal showAllRehearsal() {
	        return this;
	    }

		public int getId() {
			return idRehearsal;
		}
}
