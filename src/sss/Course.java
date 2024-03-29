package sss;


import java.io.Serializable;
	 
	public class Course implements Serializable{
		private String id;
		private String name;
	 
		public Course(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	 
		public Course() {
			super();
		}
	 
		public String getId() {
			return id;
		}
	 
		public void setId(String id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Course other = (Course) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	 
		public String toString() {
			return "�γ̺ţ�" + id + " " + "�γ�����" + name;
		}
	 
	}

	

