目前，Easer的數據存儲爲文件形式。其中JSON爲目前主力，舊的XML格式將在不遠的將來被移除。
本文描述文件內容的格式，以便有需要者參考。

## 版本5
對版本4進行微調——刪除不必要內容。

調整僅涉及*使用內嵌情境的事件*，所以此處僅列出它。

### 使用內嵌情境的事件
```JSON
{
	"name":名稱,
	"version":數據版本,
	"active":true or false,
	"profile":行爲集名稱,
	"after":父事件名稱,
	"trigger":{
		"type":"raw_event",
		"logic":"after" or "any" or "before" or "is" or "is_not" or "none",
		"situation":{
			"spec":對應EventPlugin的id,
			"data":對應EventPlugin的數據
		}
	}
}

## 版本4
該版本首次引入*情境*。  
以前版本中的*事件*被視爲“使用內嵌情境的事件”。
### 行爲集
```
#JSON
{
	"name":名稱,
	"version":數據版本,
	"operation":[
		{
			"spec":對應OperationPlugin的id,
			"data":對應OperationPlugin的數據
		},
		...
	]
}
```

### 事件
#### 使用內嵌情境
```
#JSON
{
	"name":名稱,
	"version":數據版本,
	"active":true or false,
	"profile":行爲集名稱,
	"after":父事件名稱,
	"trigger":{
		"type":"raw_event",
		"logic":"after" or "any" or "before" or "is" or "is_not" or "none",
		"situation":{
			"spec":對應EventPlugin的id,
			"data":對應EventPlugin的數據
		}
	},
	"reverse":true or false,
	"repeatable":true or false,
	"persistent":true or false
}
```
#### 使用預定義情境
```
#JSON
{
	"name":名稱,
	"version":數據版本,
	"active":true or false,
	"profile":行爲集名稱,
	"after":父事件名稱,
	"trigger":{
		"type":"pre_defined",
		"scenario":情境名稱
	},
	"reverse":true or false,
	"repeatable":true or false,
	"persistent":true or false
}
```
### 情境
```
#JSON
{
	"name":名稱,
	"version":數據版本,
	"logic":"after" or "any" or "before" or "is" or "is_not" or "none",
	"situation":{
		"spec":對應EventPlugin的id,
		"data":對應EventPlugin的數據
	}
}

```
