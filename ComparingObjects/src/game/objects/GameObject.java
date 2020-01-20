package game.objects;

public class GameObject {
	private int id;
	private String name;

	// @formatter:off
	
	@SuppressWarnings("unused") // Added temporarily to suppress 'not used' warning
	private int[][] comparison = {
			//				rock	paper	scissors
			/* rock */ 		{	0,		0,		0,			},
			/* paper */		{	0,		0,		0,			},
			/* scissors */ 	{	0,		0,		0,			},
	};
	
	// @formatter:on

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
}
