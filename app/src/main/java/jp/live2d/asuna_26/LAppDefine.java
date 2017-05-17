/**
 *
 *  You can modify and use this source freely
 *  only for the development of application related Live2D.
 *
 *  (c) Live2D Inc. All rights reserved.
 */
package jp.live2d.asuna_26;


public class LAppDefine
{

    public static boolean DEBUG_LOG=true;
    public static boolean DEBUG_TOUCH_LOG=true;

    public static final float VIEW_LOGICAL_LEFT = -1;
	public static final float VIEW_LOGICAL_RIGHT = 1;

	public static final float VIEW_LOGICAL_MAX_LEFT = -2;
	public static final float VIEW_LOGICAL_MAX_RIGHT = 2;
	public static final float VIEW_LOGICAL_MAX_BOTTOM = -2;
	public static final float VIEW_LOGICAL_MAX_TOP = 2;

	public static final String BACK_IMAGE_NAME = "image/back_class_normal.png" ;

	public static final String charaName = "asuna_26";

	public static final String MODEL_JSON = charaName + "/" + charaName + ".model.json";
	public static final String MODEL_MOC = charaName + "/moc/" + charaName + ".moc";
	
	public static final String MOTION_PATH_ANGRY= charaName + "/" + "mtn/I_SURPRISE.mtn";
	public static final String MOTION_PATH_HAPPY= charaName + "/" + "mtn/I_FUN.mtn";
	public static final String MOTION_PATH_NORMAL= charaName + "/" + "mtn/IDLING.mtn";
	
	static final String HIT_AREA_HEAD		="head";
	static final String HIT_AREA_BODY		="body";
	static final String HIT_AREA_BREAST		="chest";

}
