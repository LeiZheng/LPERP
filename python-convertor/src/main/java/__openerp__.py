


{
    'name': 'Attendances',
    'version': '1.1',
    'category': 'Human Resources',
    'description': """them.""",
    'author': 'OpenERP SA',
    'website': 'https://www.odoo.com/page/employees',
    'images': ['images/hr_attendances.jpeg'],
    'depends': ['hr', 'report'],
    'data': [
        'security/ir_rule.xml',
        'security/ir.model.access.csv',
        'hr_attendance_view.xml',
        'hr_attendance_report.xml',
        'wizard/hr_attendance_error_view.xml',
        'res_config_view.xml',
        'views/report_attendanceerrors.xml',
        'views/hr_attendance.xml',
    ],
    'demo': ['hr_attendance_demo.xml'],
    'test': [
        'test/attendance_process.yml',
        'test/hr_attendance_report.yml',
    ],
    'installable': True,
    'auto_install': False,
    'qweb': ["static/src/xml/attendance.xml"],
    'number': 32,
    'objectInst': {'id':'idexam',},
    
}


