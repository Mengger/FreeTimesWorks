CREATE TABLE Customer(
	id_Card_No varchar(18) PRIMARY KEY COMMENT '身份证号码',
	name varchar(10) NOT NULL COMMENT '姓名',
	nation varchar(5) COMMENT '民族',
	birthday date COMMENT '出生日期',
	address varchar(80) COMMENT '家庭地址',
	phone_Num varchar(11) NOT NULL COMMENT '手机号码',
	second_phone_num varchar(11) COMMENT '备用手机号',
	home_Num varchar(12) COMMENT '家庭电话号码',
	emergency_Num varchar(12) COMMENT '紧急联系电话',
	gender varchar(1) COMMENT '性别 1代表男    0代表女',
	hobby varchar(200) COMMENT '兴趣 爱好',
	works_Property varchar(50) COMMENT '工作类型',
	QQ_num varchar(12) COMMENT 'QQ号码',
	nike_name varchar(20) COMMENT '会员昵称',
	auto_mobile varchar(100) COMMENT '车牌号码',
	e_mail varchar(50) COMMENT 'e-mail',
	create_time date NOT NULL COMMENT '创建时间',
	modify_time date COMMENT '修改时间',
	ext1 varchar(100) COMMENT '备注字段',
	ext2 varchar(500) COMMENT '备注字段',
	ext3 varchar(20) COMMENT '备注字段',
	ext4 varchar(20) COMMENT '备注字段',
	ext5 date COMMENT '备注字段'
) COMMENT '用户表' ;


create table automobile(
	automobile_license varchar(10) COMMENT '车牌号',
	frame_number varchar(17) primary key COMMENT '车架号',
	engine_number varchar(17) COMMENT '发动机号',
	automobile_brand varchar(20) COMMENT '汽车品牌',
	automobile_model varchar(20) COMMENT '汽车型号',
	automobile_output_value varchar(5) COMMENT '排量',
	automobile_color varchar(8) comment '汽车颜色',
	seat int COMMENT '座位数',
	automobile_insurance_company varchar(40) COMMENT '汽车保险公司',
	compulsory_insurance_time varchar(80) COMMENT '交强险的有效期',
	other_insurance_time varchar(80) COMMENT '其他保险的有效期',
	insurance_type varchar(15) COMMENT '保险类型',
	automobile_pic varchar(100) COMMENT '汽车照片路径',
	create_time date COMMENT '创建时间',
	modify_time date COMMENT '修改时间',
	ext1 varchar(100) COMMENT '备注字段',
	ext2 varchar(500) COMMENT '备注字段',
	ext3 varchar(20) COMMENT '备注字段',
	ext4 varchar(20) COMMENT '备注字段',
	ext5 date COMMENT '备注字段'
) COMMENT '车辆信息表';


create table orders(
	order_create_time date COMMENT '订单创建时间',
	order_modify_time date  COMMENT '订单修改时间',
	order_num varchar(15) primary key  COMMENT '订单号',
	automobile_frame_number varchar(17)  COMMENT '车架号',
	service_station_no varchar(17) COMMENT '服务站编号',
	service_station_split_no varchar(13) COMMENT '分店编号',
	part_consume_count int COMMENT '配件总价格',
	part_discount int COMMENT '配件折扣,打几折',
	part_count_discount int COMMENT '配件折扣价格',
	man_hour_count int COMMENT '工时数',
	man_hour_price int COMMENT '工时单价',
	man_hour_discount int COMMENT '工时折扣,打几折',
	man_hour_discount_count int COMMENT '工时折扣价格',
	total_prices int COMMENT '总消费',
	total_discount int COMMENT '总折扣',
	repair_person_allow varchar(18) COMMENT '送修人',
	is_himself varchar(1) COMMENT '送修人是否为车主  0不是    1车主',
	customer_desc varchar(1000) COMMENT '客户描述症状',
	automobile_doctor_diagnosis_result varchar(1000) COMMENT '维修技师诊断结果',
	doctor_advice varchar(1000) COMMENT '维修技师建议',
	replace_part varchar(1000) COMMENT '替换配件',
	service_type varchar(5) COMMENT '服务类型  0检测  1保养 2维修 3美容  4事故  1-2保养加维修',
	service_adviser varchar(10) COMMENT '服务顾问',
	doctor_team_no varchar(20)	COMMENT '维修团队',
	repair_doctor_no varchar(20) COMMENT '主维修技师no',
	check_doctor_no varchar(20)	COMMENT '复查技师no',
	last_check_doctor_no varchar(20) COMMENT '最终质检技师',
	cust_call_back_num varchar(12) COMMENT '客户回访电话',
	Call_back_result varchar(3) COMMENT '回访结果  客户打分分数',
	cust_call_back_memo varchar(1000) COMMENT '客户回访的应答',
	cust_satisfaction varchar(3) COMMENT '客户满意度  客户自己评价',
	cust_memo varchar(1000) COMMENT '客户自己评价内容',
	cust_assess_pic varchar(200) COMMENT '客户上传照片路径',
	is_need_invoice varchar(1) COMMENT '是否需要发票   0不需要   1需要',
	invoice_title varchar(100) COMMENT '发票抬头',
	invoice_status varchar(1)  COMMENT '发票状态  0未打印   1已打印',
	order_status varchar(2) COMMENT '订单状态   1待接车  2待派单  3待检查  4待维修  5待完成   6待结账  7工单信息待完善  8待回访  9完成'
) COMMENT '车辆维修详情表';


create table part_info(
	part_create_time date COMMENT '配件首次创建时间',
	service_station_no varchar(17) COMMENT '服务站编号',
	service_station_split_no varchar(13) COMMENT '分店编号',
	warehouse_area varchar(30) COMMENT '库区',
	position_items varchar(30) COMMENT '仓位',
	part_no varchar(30) COMMENT '配件编号',
	part_name varchar(50) COMMENT '配件名称',
	part_desc varchar(200) COMMENT '配件描述',
	stock_amount int COMMENT '配件库存数量'
) COMMENT '配件信息表';


create table storage_sale_order_info(
	part_order_create_time date COMMENT '配件订单创建时间',
	part_order_no varchar(30) COMMENT '配件订单编号',
	part_no varchar(30) COMMENT '配件编号',
	part_name varchar(50) COMMENT '配件名称',
	service_station_no varchar(17) COMMENT '服务站编号',
	service_station_split_no varchar(13) COMMENT '分店编号',
	warehouse_area varchar(30) COMMENT '库区',
	position_items varchar(30) COMMENT '仓位',
	part_supplier_no varchar(20) COMMENT '供应商编号',
	part_supplier_name varchar(60) COMMENT '供应商名称',
	purchase_num int COMMENT '数量',
	purchase_unit_price int COMMENT '单价',
	purchase_count_price int COMMENT '总价',
	order_status varchar(1) COMMENT '订单状态  0挂账  1现付  2财务已结账',
	order_type varchar(1) COMMENT '订单类型  0入库订单   1出库订单',
	order_num varchar(15) COMMENT '出库时的订单号',
	operator varchar(20) COMMENT '操作人'
) COMMENT '配件仓库出库入库记录表';


create table order_detail(
	order_num varchar(15) COMMENT '订单号',
	project_desc varchar(200) COMMENT '所做项目描述',
	replace_part_man_hour int COMMENT '工时数',
	doctor_no varchar(20) COMMENT '维修技师no'
) COMMENT '订单详细记录表';


