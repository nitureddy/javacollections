package com.contact;

public class Movie {

		private String movieName;
		private String language;
		private int rating;
		private String star;
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getStar() {
			return star;
		}
		public void setStar(String star) {
			this.star = star;
		}
		public Movie(String movieName, String language, int rating, String star) {
			super();
			this.movieName = movieName;
			this.language = language;
			this.rating = rating;
			this.star = star;
		}
		@Override
		public String toString() {
			return "Movie [movieName=" + movieName + ", language=" + language + ", rating=" + rating + ", star=" + star
					+ "]";
		}

}
