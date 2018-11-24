class Opcode:
	pcsel = '011'
	wasel = '1'
	asel = '0'
	ra2sel = '0'
	bsel = '0'
	alufn = '000000' 
	wdsel = '00'
	werf = '1'
	moe = '0'
	xwr = '0'
	oppcode = 'a'
	name = 'Unused'
	
	
LD = Opcode()
ST = Opcode()
ADD = Opcode()
SUB = Opcode()
CMPEQ = Opcode()
CMPLT = Opcode()
CMPLE = Opcode()
AND = Opcode()
OR = Opcode()
XOR = Opcode()
SHL = Opcode()
SHR = Opcode()
SRA = Opcode()
ADDC = Opcode()
SUBC = Opcode()
CMPEQC = Opcode()
CMPLTC = Opcode()
CMPLEC = Opcode()
ANDC = Opcode()
ORC = Opcode()
XORC = Opcode()
SHLC = Opcode()
SHRC = Opcode()
SRAC = Opcode()
BEQ = Opcode()
BNE = Opcode()
JMP = Opcode()
LDR = Opcode()

LD.pcsel = '000'
ST.pcsel = '000'
ADD.pcsel = '000'
SUB.pcsel = '000'
CMPEQ.pcsel = '000'
CMPLT.pcsel = '000'
CMPLE.pcsel = '000'
AND.pcsel = '000'
OR.pcsel = '000'
XOR.pcsel = '000'
SHL.pcsel = '000'
SHR.pcsel = '000'
SRA.pcsel = '000'
ADDC.pcsel = '000'
SUBC.pcsel = '000'
CMPEQC.pcsel = '000'
CMPLTC.pcsel = '000'
CMPLEC.pcsel = '000'
ANDC.pcsel = '000'
ORC.pcsel = '000'
XORC.pcsel = '000'
SHLC.pcsel = '000'
SHRC.pcsel = '000'
SRAC.pcsel = '000'
BEQ.pcsel = '000'
BNE.pcsel = '000'
JMP.pcsel = '010'
LDR.pcsel = '000'

LDR.asel = '1'

LD.wasel = '0'
ST.wasel = '0'
ADD.wasel = '0'
SUB.wasel = '0'
CMPEQ.wasel = '0'
CMPLT.wasel = '0'
CMPLE.wasel = '0'
AND.wasel = '0'
OR.wasel = '0'
XOR.wasel = '0'
SHL.wasel = '0'
SHR.wasel = '0'
SRA.wasel = '0'
ADDC.wasel = '0'
SUBC.wasel = '0'
CMPEQC.wasel = '0'
CMPLTC.wasel = '0'
CMPLEC.wasel = '0'
ANDC.wasel = '0'
ORC.wasel = '0'
XORC.wasel = '0'
SHLC.wasel = '0'
SHRC.wasel = '0'
SRAC.wasel = '0'
BEQ.wasel = '0'
BNE.wasel = '0'
JMP.wasel = '0'
LDR.wasel = '0'


LD.alufn = '000000'
ST.alufn = '000000'
ADD.alufn = '000000'
SUB.alufn = '000001'
CMPEQ.alufn = '110011'
CMPLT.alufn = '110101'
CMPLE.alufn = '110111'
AND.alufn = '011000'
OR.alufn = '011110'
XOR.alufn = '010110'
SHL.alufn = '100000'
SHR.alufn = '100001'
SRA.alufn = '100011'
ADDC.alufn = '000000'
SUBC.alufn = '000001'
CMPEQC.alufn = '110011'
CMPLTC.alufn = '110101'
CMPLEC.alufn = '110111'
ANDC.alufn = '011000'
ORC.alufn = '011110'
XORC.alufn = '010110'
SHLC.alufn = '100000'
SHRC.alufn = '100001'
SRAC.alufn = '100011'
LDR.alufn = '011010'

ST.xwr = '1'

LD.moe = '1'
LDR.moe = '1'

LD.werf = '1'
ST.werf = '0'
ADD.werf = '1'
SUB.werf = '1'
CMPEQ.werf = '1'
CMPLT.werf = '1'
CMPLE.werf = '1'
AND.werf = '1'
OR.werf = '1'
XOR.werf = '1'
SHL.werf = '1'
SHR.werf = '1'
SRA.werf = '1'
ADDC.werf = '1'
SUBC.werf = '1'
CMPEQC.werf = '1'
CMPLTC.werf = '1'
CMPLEC.werf = '1'
ANDC.werf = '1'
ORC.werf = '1'
XORC.werf = '1'
SHLC.werf = '1'
SHRC.werf = '1'
SRAC.werf = '1'
BEQ.werf = '1'
BNE.werf = '1'
JMP.werf = '1'
LDR.werf = '1'


LD.ra2sel = '0'#sssssss
ST.ra2sel = '1'
ADD.ra2sel = '0' 
SUB.ra2sel = '0'
CMPEQ.ra2sel = '0'
CMPLT.ra2sel = '0'
CMPLE.ra2sel = '0'
AND.ra2sel = '0'
OR.ra2sel = '0'
XOR.ra2sel = '0'
SHL.ra2sel = '0'
SHR.ra2sel = '0'
SRA.ra2sel = '0'
ADDC.ra2sel = '0'
SUBC.ra2sel = '0'
CMPEQC.ra2sel = '0'
CMPLTC.ra2sel = '0'
CMPLEC.ra2sel = '0'
ANDC.ra2sel = '0'
ORC.ra2sel = '0'
XORC.ra2sel = '0'
SHLC.ra2sel = '0'
SHRC.ra2sel = '0'
SRAC.ra2sel = '0'

LD.bsel = '1'
ST.bsel = '1'
ADD.bsel = '0'
SUB.bsel = '0'
CMPEQ.bsel = '0'
CMPLT.bsel = '0'
CMPLE.bsel = '0'
AND.bsel = '0'
OR.bsel = '0'
XOR.bsel = '0'
SHL.bsel = '0'
SHR.bsel = '0'
SRA.bsel = '0'
ADDC.bsel = '1'
SUBC.bsel = '1'
CMPEQC.bsel = '1'
CMPLTC.bsel = '1'
CMPLEC.bsel = '1'
ANDC.bsel = '1'
ORC.bsel = '1'
XORC.bsel = '1'
SHLC.bsel = '1'
SHRC.bsel = '1'
SRAC.bsel = '1'

LD.wdsel = '10'
ST.wdsel = '00'
ADD.wdsel = '01' 
SUB.wdsel = '01'
CMPEQ.wdsel = '01'
CMPLT.wdsel = '01'
CMPLE.wdsel = '01'
AND.wdsel = '01'
OR.wdsel = '01'
XOR.wdsel = '01'
SHL.wdsel = '01'
SHR.wdsel = '01'
SRA.wdsel = '01'
ADDC.wdsel = '01'
SUBC.wdsel = '01'
CMPEQC.wdsel = '01'
CMPLTC.wdsel = '01'
CMPLEC.wdsel = '01'
ANDC.wdsel = '01'
ORC.wdsel = '01'
XORC.wdsel = '01'
SHLC.wdsel = '01'
SHRC.wdsel = '01'
SRAC.wdsel = '01'
BEQ.wdsel = '00'
BNE.wdsel = '00'
JMP.wdsel = '00'
LDR.wdsel = '10'

LD.xwr = '0'
ST.xwr = '1'
ADD.xwr = '0'
SUB.xwr = '0'
CMPEQ.xwr = '0'
CMPLT.xwr = '0'
CMPLE.xwr = '0'
AND.xwr = '0'
OR.xwr = '0'
XOR.xwr = '0'
SHL.xwr = '0'
SHR.xwr = '0'
SRA.xwr = '0'
ADDC.xwr = '0'
SUBC.xwr = '0'
CMPEQC.xwr = '0'
CMPLTC.xwr = '0'
CMPLEC.xwr = '0'
ANDC.xwr = '0'
ORC.xwr = '0'
XORC.xwr = '0'
SHLC.xwr = '0'
SHRC.xwr = '0'
SRAC.xwr = '0'

LD.oppcode = '011000'
ST.oppcode = '011001'
ADD.oppcode = '100000'
SUB.oppcode = '100001'
CMPEQ.oppcode = '100100'
CMPLT.oppcode = '100101'
CMPLE.oppcode = '100110'
AND.oppcode = '101000'
OR.oppcode = '101001'
XOR.oppcode = '101010'
SHL.oppcode = '101100'
SHR.oppcode = '101101'
SRA.oppcode = '101110'
ADDC.oppcode = '110000'
SUBC.oppcode = '110001'
CMPEQC.oppcode = '110100'
CMPLTC.oppcode = '110101'
CMPLEC.oppcode = '110110'
ANDC.oppcode = '111000'
ORC.oppcode = '111001'
XORC.oppcode = '111010'
SHLC.oppcode = '111100'
SHRC.oppcode = '111101'
SRAC.oppcode = '111110'
BEQ.oppcode = '011101'
BNE.oppcode = '011110'
JMP.oppcode = '011011'
LDR.oppcode = '011111'

LD.name = 'LD'
ST.name = 'ST'
ADD.name = 'ADD'
SUB.name = 'SUB'
CMPEQ.name = 'CMPEQ'
CMPLT.name = 'CMPLT'
CMPLE.name = 'CMPLE'
AND.name = 'AND'
OR.name = 'OR'
XOR.name = 'XOR'
SHL.name = 'SHL'
SHR.name = 'SHR'
SRA.name = 'SRA'
ADDC.name = 'ADDC'
SUBC.name = 'SUBC'
CMPEQC.name = 'CMPEQC'
CMPLTC.name = 'CMPLTC'
CMPLEC.name = 'CMPLEC'
ANDC.name = 'ANDC'
ORC.name = 'ORC'
XORC.name = 'XORC'
SHLC.name = 'SHLC'
SHRC.name = 'SHRC'
SRAC.name = 'SRAC'
BEQ.name = 'BEQ'
BNE.name = 'BNE'
JMP.name = 'JMP'
LDR.name = 'LDR'



op_dic = []
op_dic.append(ST)
op_dic.append(LD)
op_dic.append(ADD)
op_dic.append(SUB)
op_dic.append(CMPEQ)
op_dic.append(CMPLT)
op_dic.append(CMPLE)
op_dic.append(AND)
op_dic.append(OR)
op_dic.append(XOR)
op_dic.append(SHL)
op_dic.append(SHR)
op_dic.append(SRA)
op_dic.append(ADDC)
op_dic.append(SUBC)
op_dic.append(CMPEQC)
op_dic.append(CMPLTC)
op_dic.append(CMPLEC)
op_dic.append(ANDC)
op_dic.append(ORC)
op_dic.append(XORC)
op_dic.append(SHLC)
op_dic.append(SHRC)
op_dic.append(SRAC)
op_dic.append(BEQ)
op_dic.append(BNE)
op_dic.append(JMP)
op_dic.append(LDR)

def opcode_add_zero(bin_num):
	bit_num = len(bin_num[2:])
	output = bin_num[2:]
	for i in range(6-bit_num):
		output = '0' + output
		
	return output
	
def find_opcode(target):
	for opcode in op_dic:
		if target == opcode.oppcode:
			return opcode
	allzero = Opcode()
	allzero.moe = '0'
	allzero.pcsel = '011'
	allzero.wasel = '1'
	return allzero

count = 0
for i in range(64):
	bin_num = opcode_add_zero(str(bin(i)))
	opcode = find_opcode(bin_num)
	
	head = '+ 0b'
	body = opcode.pcsel + opcode.wasel + opcode.asel + opcode.ra2sel + opcode.bsel + opcode.alufn + opcode.wdsel + opcode.werf + opcode.moe + opcode.xwr
	tail = ' //  0b' + str(bin_num) + ' = ' + str(i+1) +' ' + opcode.name
	
#	if body != '000000000000000000':
#		count += 1
#		print(opcode.name+" "+str(count))
		
	
	print(head + body + tail)
	
print("-------------")
print(count)
#pcsel = '000'
#	wasel = '0'
#	asel = '0'
#	ra2sel = '0'
#	bsel = '0'
#	alufn = '000000' 
#	wdsel = '00'
#	werf = '0'
#	moe = '1'
#	xwr = '0'