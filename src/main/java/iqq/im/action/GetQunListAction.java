
package iqq.im.action;

import iqq.im.QQActionListener;
import iqq.im.QQException;
import iqq.im.bean.QQAccount;
import iqq.im.bean.QQGroup;
import iqq.im.core.*;
import iqq.im.event.QQActionEvent;
import iqq.im.http.QQHttpCookie;
import iqq.im.http.QQHttpRequest;
import iqq.im.http.QQHttpResponse;

import iqq.im.service.HttpService;
import iqq.im.util.QQEncryptor;
import org.slf4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;

/**
 * 获取群列表名称
 *
 * @author ChenZhiHui
 * @since 2013-2-21
 */
public class GetQunListAction extends AbstractHttpAction {
	private static final Logger LOG = LoggerFactory.getLogger(GetQunListAction.class);

	/**
	 * <p>Constructor for GetGroupListAction.</p>
	 *
	 * @param context a {@link iqq.im.core.QQContext} object.
	 * @param listener a {@link iqq.im.QQActionListener} object.
	 */
	public GetQunListAction(QQContext context, QQActionListener listener) {
		super(context, listener);
	}

	/** {@inheritDoc} */
	@Override
	public QQHttpRequest onBuildRequest() throws QQException, JSONException {
        
    
		QQHttpRequest req = createHttpRequest("GET",
				QQConstants.URL_QUN_QZONE);
	
		//req.addHeader("Referer", QQConstants.REFFER);

		return req;
	}

	/** {@inheritDoc} */
	@Override
	protected void onHttpStatusOK(QQHttpResponse response) throws QQException,
			JSONException {
		// {"retcode":0,"result":{"gmasklist":[{"gid":1000,"mask":0},{"gid":1638195794,"mask":0},{"gid":321105219,"mask":0}],
		// "gnamelist":[{"flag":16777217,"name":"iQQ","gid":1638195794,"code":2357062609},{"flag":1048577,"name":"iQQ核心开发区","gid":321105219,"code":640215156}],"gmarklist":[]}}
		//QQStore store = getContext().getStore();
		System.out.println(response.getResponseString());
//		JSONObject json = new JSONObject(response.getResponseString());
//		
//		int retcode = json.getInt("retcode");
//		if (retcode == 0) {
//			// 处理好友列表
//		
//			System.out.println("hello");
//			notifyActionEvent(QQActionEvent.Type.EVT_OK, "ok");
//
//		} else {
//			LOG.warn("unknown retcode: " + retcode);
//			notifyActionEvent(QQActionEvent.Type.EVT_ERROR, null);
//		}

	}

}
