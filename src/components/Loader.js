import React from 'react'
import { Spinner } from 'react-bootstrap'

const Loader = () => {
  return (
    <Spinner
      animation='border'
      role='status'
      style={{
        width: '50px',
        height: '50px',
        margin: 'auto',
        display: 'block',
      }}
    >
      <i class="fa fa-refresh fa-spin fa-3x fa-fw"></i>
      <span className='sr-only'>Loading...</span>
    </Spinner>
  )
}

export default Loader
