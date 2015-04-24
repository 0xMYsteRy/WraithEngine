package wraith.library.LWJGL;

public class Camera extends Object3D{
	public Camera(float fov, float aspect, float near, float far){ MatrixUtils.setupPerspective(fov, aspect, near, far); }
	public Camera(float near, float far){ MatrixUtils.setupOrtho(near, far); }
	public void update(float delta){}
}